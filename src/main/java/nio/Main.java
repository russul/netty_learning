package nio;

import java.io.IOException;
import java.nio.channels.AsynchronousChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        AsynchronousChannel asynchronousChanne = new AsynchronousChannel() {
            public void close() throws IOException {

            }

            public boolean isOpen() {
                return false;
            }
        };
    }
}
