package ru.otus.hw.webserver.frontend.sockets;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SocketURL {
    @NonNull
    private final String host;

    @NonNull
    private final int port;
}