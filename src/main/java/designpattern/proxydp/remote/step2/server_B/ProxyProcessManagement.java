package designpattern.proxydp.remote.step2.server_B;

import designpattern.proxydp.remote.ProcessManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ProxyProcessManagement implements ProcessManagement {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public ProxyProcessManagement() throws IOException {
        clientSocket = new Socket("127.0.0.1", 6666);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String resp = in.readLine();
        return resp;
    }



    @Override
    public void startProcess(String id) {
        try {
            sendMessage("startProcess "+id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stopProcess(String id) {
        try {
            sendMessage("stopProcess "+id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
