package software.ulpgc.katas.infrastructure;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;
import software.ulpgc.katas.architecture.domain.CalculateFibonacciSeriesUseCase;
import software.ulpgc.katas.architecture.ports.Output;
import software.ulpgc.katas.infrastructure.adapters.JavalinContextInput;
import software.ulpgc.katas.infrastructure.adapters.JsonSeriesSerializer;

public class Main {
    static void main() {
        Javalin.create(c -> init(c)).start(8081);
    }

    private static void init(JavalinConfig config) {
        config.routes.get("/fibonacci", c -> fibonacci(c));
    }

    private static void fibonacci(Context context) {
        Output output = new CalculateFibonacciSeriesUseCase(new JsonSeriesSerializer())
                .execute(new JavalinContextInput(context));
        context.result(output.result());
    }
}
