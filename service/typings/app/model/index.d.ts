// This file was auto created by egg-ts-helper
// Do not modify this file!!!!!!!!!

import 'egg'; // Make sure ts to import egg declaration at first
import Discuss from '../../../app/model/discuss';
import Follow from '../../../app/model/follow';
import Form from '../../../app/model/form';
import TopicLike from '../../../app/model/topic-like';
import Topic from '../../../app/model/topic';
import User from '../../../app/model/user';

declare module 'sequelize' {
  interface Sequelize {
    Discuss: ReturnType<typeof Discuss>;
    Follow: ReturnType<typeof Follow>;
    Form: ReturnType<typeof Form>;
    TopicLike: ReturnType<typeof TopicLike>;
    Topic: ReturnType<typeof Topic>;
    User: ReturnType<typeof User>;
  }
}
