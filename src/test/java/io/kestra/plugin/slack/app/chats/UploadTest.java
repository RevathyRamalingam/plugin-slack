package io.kestra.plugin.slack.app.chats;

import org.junit.jupiter.api.Test;

import com.slack.api.methods.request.files.FilesUploadV2Request;

import io.kestra.core.junit.annotations.KestraTest;
import io.kestra.plugin.slack.app.AbstractSlackClientTest;

import static org.assertj.core.api.Assertions.assertThat;

@KestraTest
public class UploadTest extends AbstractSlackClientTest {

    @Test
    void initialCommentIsSet() {
        String comment = "This is a test comment";

        FilesUploadV2Request request = FilesUploadV2Request.builder()
            .token("test-token")
            .initialComment(comment)
            .build();

        assertThat(request.getInitialComment())
            .isEqualTo(comment);
    }
}