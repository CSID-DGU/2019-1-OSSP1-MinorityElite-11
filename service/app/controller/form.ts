import { Controller } from 'egg'

const { Storage } = require('@google-cloud/storage');
const storage = new Storage({
  projectId: 'My First Project',
  keyFilename: 'config/My_First_Project-14b55a6edafc.json'
});
const format = require('util').format;

class FormController extends Controller {
    public async addForm(){
        const {ctx} = this;
        console.log(ctx.request.body);
        
        const filename = ctx.request.body.title;
        const bucket = await storage.bucket('shopingram');
        const file = bucket.file(`${filename}.json`);
        await file.save(ctx.request.body.formData);
        const formUrl = format(`https://storage.googleapis.com/shopingram/${filename}.json`);
        const userId = ctx.user.userId;
        const newForm = {
          formTitle: filename,
          formUrl : formUrl, 
          userId : userId
        }
        await ctx.service.form.insertForm(newForm);

        ctx.returnBody(200, "form insert success");
    }

    public async getFormList(){
      const {ctx} = this;
      const userId = ctx.user.userId;
      console.log('getformlist');
      const forms = await ctx.service.form.queryFormList({
        userId: userId
      });
      console.log('getformlist',forms);

      ctx.returnBody(200, forms);
    }
}

module.exports = FormController
