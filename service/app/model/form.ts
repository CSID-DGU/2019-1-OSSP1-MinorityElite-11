module.exports = app => {
  const {STRING, INTEGER, DATE, NOW} = app.Sequelize;
  
    const Form = app.model.define('form', {
      formId: {type: INTEGER, primaryKey: true, autoIncrement: true},
      userId: {type: INTEGER},
      formTitle: {type: STRING(255), allowNull: false}, 
      formUrl: {type: STRING(1000), allowNull: false},
      created_at: {type: DATE, defaultValue: NOW},
      updated_at: {type: DATE, defaultValue: NOW}
    }, {
      freezeTableName: true 
    });
  
    return Form;
  };