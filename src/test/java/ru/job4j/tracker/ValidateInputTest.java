package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidateInput3() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"3", "2", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:!");
        assertThat(select).isEqualTo(3);
    }

    @Test
    public void whenValidateInput4() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"4"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu:!");
        assertThat(select).isEqualTo(4);
    }

    @Test
    public void whenValidateInputMinus() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1", "2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}