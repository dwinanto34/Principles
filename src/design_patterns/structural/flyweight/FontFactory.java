package design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private static final Map<String, Font> fontCache = new HashMap<>();

    public static Font getFont(String name) {
        Font font = fontCache.get(name);

        if (font == null) {
            font = new ConcreteFont(name);
            fontCache.put(name, font);
        }

        return font;
    }

    public static int getCacheSize() {
        return fontCache.size();
    }
}
