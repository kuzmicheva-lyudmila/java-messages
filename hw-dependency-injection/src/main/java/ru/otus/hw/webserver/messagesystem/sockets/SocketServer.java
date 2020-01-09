package ru.otus.hw.webserver.messagesystem.sockets;

import java.io.IOException;
import java.net.Socket;

public interface SocketServer {
    void go();

    void clientHandler(Socket clientSocket) throws IOException;
}
