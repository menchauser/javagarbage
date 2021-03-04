package test.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Collection;
import java.util.Map;

public class TestBigJson {
    public static void main(String[] args) throws IOException {
        var mapper = new ObjectMapper();
        var text = Files.readString(Paths.get(args[0]));
        var start = System.nanoTime();
        Map<String, ?> result = mapper.readValue(text, Map.class);
        var elapsed = System.nanoTime() - start;
        System.out.printf("Parsed %d messages in %s\n", ((Collection) result.get("messages")).size(), Duration.ofNanos(elapsed));
    }
}
