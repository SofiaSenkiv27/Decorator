package decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class MockedDocument implements Document {
    private String gcdPath;
    @Override
    public String parse() {
        return "Mocked Document Parse";
    }

    @Override
    public String getGcsPath() {
        throw new UnsupportedOperationException("Unimplemented");
    }
}
