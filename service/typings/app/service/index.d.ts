// This file was auto created by egg-ts-helper
// Do not modify this file!!!!!!!!!

import 'egg'; // Make sure ts to import egg declaration at first
import Follow from '../../../app/service/follow';
import Form from '../../../app/service/form';
import Topic from '../../../app/service/topic';
import User from '../../../app/service/user';
import TypeFollowInterface from '../../../app/service/type/follow-interface';
import TypeTopicInterface from '../../../app/service/type/topic-interface';

declare module 'egg' {
  interface IService {
    follow: Follow;
    form: Form;
    topic: Topic;
    user: User;
    type: {
      followInterface: TypeFollowInterface;
      topicInterface: TypeTopicInterface;
    };
  }
}
