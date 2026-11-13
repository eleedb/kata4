package software.ulpgc.katas.infrastructure.adapters;

import io.javalin.http.Context;
import software.ulpgc.katas.architecture.ports.Input;

import java.io.Serializable;

public class JavalinContextInput implements Input {
    private final Context context;

    public JavalinContextInput(Context context) {
        this.context = context;
    }

    @Override
    public Parameter get(String key) {
        return new Parameter(){

            @Override
            public String asString() {
                return context.queryParam(key);
            }

            @Override
            public int asInteger() {
                try {
                    return Integer.parseInt(asString());
                } catch (NumberFormatException e) {
                    return 1;
                }
            }
        };
    }
}
