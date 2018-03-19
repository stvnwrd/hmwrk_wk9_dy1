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
            String result = randomiser.randName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("template", "one.vtl");

            return new ModelAndView(model, "layout.vtl");


        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            String result = randomiser.randName();
            String result2 = randomiser.randName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("result2", result2);
            model.put("template", "two.vtl");

            return new ModelAndView(model, "layout.vtl");


        }, velocityTemplateEngine);



        get("/three", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            String result = randomiser.randName();
            String result2 = randomiser.randName();
            String result3 = randomiser.randName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("result2", result2);
            model.put("result3", result3);
            model.put("template", "three.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/four", (req, res) -> {

            Randomiser randomiser = new Randomiser();
            String result = randomiser.randName();
            String result2 = randomiser.randName();
            String result3 = randomiser.randName();
            String result4 = randomiser.randName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            model.put("result2", result2);
            model.put("result3", result3);
            model.put("result4", result4);
            model.put("template", "four.vtl");

            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

    }





}
