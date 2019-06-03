package bo.zhao.action.composite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Bo.Zhao
 * @since 19/5/26
 */
public class MessengerTest {

    private ByteArrayOutputStream stdOutBuffer = new ByteArrayOutputStream();

    private final PrintStream realStdOut = System.out;

    @BeforeEach
    public void setUp() {
        this.stdOutBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdOutBuffer));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(realStdOut);
    }


    @Test
    public void testMessageFromOrcs() {
        final Messenger messenger = new Messenger();
        testMessage(messenger.messageFromOrcs(),
                "Where there is a whip there is a way."
        );
    }

    @Test
    public void testMessageFromElves() {
        final Messenger messenger = new Messenger();
        testMessage(messenger.messageFromElves(),
                "Much wind pours from your mouth."
        );
    }


    private void testMessage(final LetterComposite letterComposite, String message) {
        String[] words = message.split(" ");
        Assertions.assertNotNull(letterComposite);
        Assertions.assertEquals(letterComposite.count(), words.length);


        letterComposite.print();

        Assertions.assertEquals(message, new String(stdOutBuffer.toByteArray()).trim());
    }
}
