import React from 'react'
import { Icon } from 'antd';
import Style from './index.scss'
import TopicDialog from '@components/topicDialog'
import { connect } from 'react-redux'
import {Link} from 'react-router-dom'


@connect(
    store => {
        return {
            dynamicList: store.topicList,
            userInfo: store.userInfo
        }
    },
    dispatch => {
        return {
            addComments: info => {
                dispatch({
                    type: 'ADD_PERSONAL_COMMENT',
                    info
                })
            },
            topicLikeFn: info => {
                dispatch({
                    type: 'TOPIC_PERSONAL_LIKE',
                    info
                })
            }
        };
    }
)
class FavoriteList extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            active: false,
            hasData: false
        }
    }

    showDialog = (item, topicIndex) => {
        TopicDialog.open({
            ...item,
            topicIndex,
            addComments: this.props.addComments,
            topicLikeFn: this.props.topicLikeFn
        });
    }

    setActiveFalse () {
        this.setState({'active': false});
    }

    setActiveTrue () {
        this.setState({'active': true});
    }

    render() {
        let {userInfo} = this.props
        return (
            <main>
                <div className={Style['favorite-list']}>
                    <ul className="favorite-nav">
                        <li 
                            className={`${this.state.active?'' : 'active'}`}
                            onClick={this.setActiveFalse.bind(this)} ><i className="topic"></i>Content</li>
                        {   
                            userInfo.businessman?
                            <li className={`${this.state.active?'active' : ''}`}
                                onClick={this.setActiveTrue.bind(this)}
                            ><i className="collect"></i>Form</li>
                            : ''
                        }
                    </ul>
                    {
                        this.state.active?
                        <section className="sellerform-container">
                            <ul className="sellerform-list">
                                <li className="sellerform-add">
                                    <Link className="sellerform-link" to={'/formedit'}></Link>
                                </li>
                            </ul>
                        </section>
                        :
                        <section className="favorite-container">
                    {
                        this.props.topicList.length >0 ?
                        <div className="descript">
                            <ul className="topic-list">
                                {
                                    this.props.topicList.map((item, index) => {
                                        return (
                                            <li className="topic" key={item.topic.topicId} onClick={() =>{ this.showDialog(item, index)}}>
                                                <img src={item.topic.topicImgList[0]} height="293px"  width="293px"/>
                                                <div className="abstract">
                                                    {
                                                        item.discuss.length > 0 ?
                                                            <span className="comments"><i className="icon"></i>{item.discuss.length}</span>
                                                            :
                                                            ""
                                                    }
                                                    {
                                                        item.topic.topicLikeCounts> 0?
                                                        <span className="favorite"><i className="icon"></i>{item.topic.topicLikeCounts}</span>
                                                        : 
                                                        ""
                                                    }
                                                </div>
                                            </li>
                                        )
                                    })
                                }
                            </ul>
                        </div>
                        :
                        <div  className="descript">
                            <div className="no-more">
                                <Icon  className="no-more-icon" type="linkedin" />
                                <span className="notice">게시물 없음</span>
                            </div>
                        </div>
                    }
                    </section>
                    }
                </div>
            </main>
        )
    }
}

export default FavoriteList