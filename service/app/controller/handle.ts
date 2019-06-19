import { Controller } from 'egg';

class HandlerController extends Controller {

    public async getQiniuToken () {
        const {ctx} = this;
        
        ctx.returnBody(200, "접근성공");
    }
}

module.exports = HandlerController
