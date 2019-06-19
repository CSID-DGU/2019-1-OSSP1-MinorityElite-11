import { Service } from 'egg';

interface insertFormParams {
    formTitle: string, 
    formUrl: string, 
    userId: string 
}

export interface queryFormParams {
    userId: string  
}
  
export default class FormService extends Service {
    public async insertForm (formParams: insertFormParams) {
        let {ctx} = this
        console.log(formParams);
        return await ctx.model.Form.create(formParams);
    }

    public async queryFormList (query) {
        let {ctx} = this
        return await ctx.model.Form.findAll({
            where: query,
            order:  [['created_at', 'DESC']]
        })
    }
}
