package software.ulpgc.katas.architecture.domain;

import software.ulpgc.katas.architecture.model.Series;
import software.ulpgc.katas.architecture.ports.Input;
import software.ulpgc.katas.architecture.ports.Output;
import software.ulpgc.katas.architecture.ports.SeriesSerializer;

public class CalculateFibonacciSeriesUseCase implements UseCase {
    private final SeriesSerializer serializer;

    public CalculateFibonacciSeriesUseCase(SeriesSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public Output execute(Input input) {
        int n = input.get("n").asInteger();
        Series series = fibonacci(n);
        return outputFor(series);
    }

    private Output outputFor(Series series) {
        return new Output() {
            @Override
            public String result() {
                return serializer.serialize(series);
            }
        };
    }

    private Series fibonacci(int n) {
        Series series = new Series();
        int a = 0;
        int b = 1;
        for (int i=0; i<n; i++) {
            series = series.put(a);
            a = b;
            b += series.last();
        }
        return series;
    }
}
