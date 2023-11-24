package javaCode.lecture11;

public abstract class StringUtils {

    private StringUtils() {
    }

    private boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
