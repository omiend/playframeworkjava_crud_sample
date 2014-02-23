import play.*;
import play.mvc.*;
import play.mvc.Http.RequestHeader;
import static play.mvc.Results.*;

public class Global extends GlobalSettings {

    // @Override
    // public void onStart(Application app) {
    //     Logger.info("Application has started");
    // }

    // @Override
    // public void onStop(Application app) {
    //     Logger.info("Application shutdown...");
    // }

    // /* (非 Javadoc)
    //  * @see play.GlobalSettings#onBadRequest(play.mvc.Http.RequestHeader, java.lang.String)
    //  */
    // @Override
    // public Result onBadRequest(RequestHeader arg0, String arg1) {
    //     Logger.info("onBadRequest...");
    //     return super.onBadRequest(arg0, arg1);
    // }

    //  (非 Javadoc)
    //  * @see play.GlobalSettings#onError(play.mvc.Http.RequestHeader, java.lang.Throwable)
     
    // @Override
    // public Result onError(RequestHeader arg0, Throwable throwable) {
    //     Logger.info("onError...");
    //     return internalServerError(views.html.defaultpages.error);
    //     // views.html.defaultpages.error(throwable)
    // }

    // /* (非 Javadoc)
    //  * @see play.GlobalSettings#onHandlerNotFound(play.mvc.Http.RequestHeader)
    //  */
    // @Override
    // public Result onHandlerNotFound(RequestHeader arg0) {
    //     Logger.info("onHandlerNotFound...");
    //     return super.onHandlerNotFound(arg0);
    // }



//    /* (非 Javadoc)
//     * @see play.GlobalSettings#onError(play.mvc.Http.RequestHeader, java.lang.Throwable)
//     */
//    @Override
//    public Result onError(RequestHeader requestheader, Throwable throwable) {
//        Logger.info("onError...");
//        return internalServerError(views.html.errorPage(throwable));
//    }
//
//    /* (非 Javadoc)
//     * @see play.GlobalSettings#onHandlerNotFound(play.mvc.Http.RequestHeader)
//     */
//    @Override
//    public Result onHandlerNotFound(RequestHeader requestheader) {
//        Logger.info("onHandlerNotFound...");
//        return Results.notFound(views.html.pageNotFound(requestheader.uri()));
//    }
//
//    /* (非 Javadoc)
//     * @see play.GlobalSettings#onBadRequest(play.mvc.Http.RequestHeader, java.lang.String)
//     */
//    @Override
//    public Result onBadRequest(RequestHeader requestheader, String s) {
//        Logger.info("onBadRequest...");
//        return Results.badRequest("Don't try to hack the URI!");
//    }
//
//
//
//    @Override
//    public Result onError(RequestHeader request, Throwable t) {
//        // return redirect(routes.Application.error());
//        return internalServerError(views.html.errorPage(t));
//    }
//
//    @Override
//    public Result onHandlerNotFound(RequestHeader request) {
//        Logger.info("onHandlerNotFound...");
//        // return redirect(routes.Application.error());
//        return Results.notFound(views.html.pageNotFound(request.uri()));
//    }
//
//    @Override
//    public Result onBadRequest(RequestHeader request, String error) {
//        Logger.info("onBadRequest...");
//        // return redirect(routes.Application.error());
//        return Results.badRequest("Don't try to hack the URI!");
//    }

}