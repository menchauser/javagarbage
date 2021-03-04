package test.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Map;

public class TestBigJson {
    public static void main(String[] args) throws IOException {
        var mapper = new ObjectMapper();
        var start = System.nanoTime();
        Map<String, ?> result = mapper.readValue(new File(args[0]), Map.class);
        var elapsed = System.nanoTime() - start;
        System.out.printf("Parsed %d messages in %s\n", ((Collection) result.get("messages")).size(), Duration.ofNanos(elapsed));
    }
}
