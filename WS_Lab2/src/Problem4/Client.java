package Problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private static final String SERVER_IP = "localhost";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket(SERVER_IP, SERVER_PORT);

		//2: Get greeting message from the server
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(in.readLine());

		//3: Send input data to the server
		BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wrt = new PrintWriter(socket.getOutputStream(), true);
		wrt.println(keyboardInput.readLine());
		
		//6: Receive status message from the server
		String status = in.readLine();
		System.out.println(status);

		socket.close();
	}

}