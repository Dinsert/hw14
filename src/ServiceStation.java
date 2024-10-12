import java.util.Objects;

public class ServiceStation {

    public void check(Transport transport) {
        if (Objects.nonNull(transport)) {
            transport.service();
        }
    }

}
