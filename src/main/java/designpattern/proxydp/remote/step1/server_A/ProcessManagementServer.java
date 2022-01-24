package designpattern.proxydp.remote.step1.server_A;

import designpattern.proxydp.remote.ProcessManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class ProcessManagementServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private ProcessManagement processManagement=new SimpleProcessManagement();

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (".".equals(inputLine)) {
                out.println("good bye");
                break;
            }

            StringTokenizer stringTokenizer = new StringTokenizer(inputLine, " ");
            System.out.println("Server receive request: ");
            System.out.println(inputLine);
            if(stringTokenizer.nextToken().equalsIgnoreCase("startProcess")){
                processManagement.startProcess(stringTokenizer.nextToken());
            }else {
                processManagement.stopProcess(stringTokenizer.nextToken());
            }

            out.println("done");
        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    public static void main(String[] args) throws IOException {
        ProcessManagementServer server=new ProcessManagementServer();
        server.start(6666);
    }
}

