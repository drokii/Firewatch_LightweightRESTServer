import io.javalin.Javalin;

public class Server {
    public static void main(String[] args) {
        Javalin app = Javalin.start(7000);
        app.post("/", ctx -> {
            System.out.println(ctx.formParam("test"));
            ctx.status(201);
        });
    }
}