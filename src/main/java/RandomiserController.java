import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandomiserController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        get("/one", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            String result = randomiser.one();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);

            return new ModelAndView(model, "one.vtl");


        }, velocityTemplateEngine);
    }

}
