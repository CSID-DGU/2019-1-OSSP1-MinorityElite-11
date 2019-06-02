import React from 'react'
import Style from './index.scss'
import { connect } from "react-redux";
import { withRouter } from 'react-router'
import Avatar from '@components/avatar'
import Carousel from '@components/carousel'
import { notification} from 'antd';
import API from '@common/api.js'
import DefaultUpload from '@components/uploadFile'


let ImageUpload = ({ changeUploadStatus, uploadImgSuccess }) => {
    return (
        <section className="image-upload">
            <div>
                {/* <span><Upload/></span> */}
                <span><DefaultUpload successCb={uploadImgSuccess} /></span>
            </div>
        </section>
    )
}

@connect(
    store => {
        return {
            userInfo: store.userInfo
        }
    }
)

class PostTopic extends React.Component {
    constructor(props){
        super(props);
    }

    state = {
        uploadStatus: 0, 
        imageList: [],
        showInputNotice: true,
        inputUrl: '',
        topicDescript: ''
    }

    changeUploadStatus =  (status) => {
        this.setState({
            uploadStatus: status,
            imageList: []
        })
    }

    changeInpurUrlStatus = () => {
        this.setState({
            showInputNotice: !this.state.showInputNotice,
            inputUrl: ''
        })
    }

    closeInputUrl = () => {
        let imgLength = this.state.imageList.length
        if (imgLength === 0) {
            this.setState({
                uploadStatus: 0
            })
        } else if (imgLength > 0) {
            this.setState({
                showInputNotice: true
            })
        }
    }

    handelChange = (value) => {
        this.setState({ inputUrl: value })
    }

    handelChangeTextArea = (event) => {
        this.setState({ topicDescript: event.target.value })
    }

    delectPhoto = (index) => {
        this.setState({
            imageList:  this.state.imageList.filter((_, i) => i !== index)
        })
    }


    uploadImgSuccess = async (url) => {
        this.setState({
            imageList: [...this.state.imageList, url],
            uploadStatus: 2
        })
        console.log(this.state.imageList)
    }

    pushImgUrl = (event) => {
        if (event.key === 'Enter') {
            let url = event.target.value
            var img = document.createElement('img');
            img.style.display = 'none';
            img.crossorigin = 'anonymous';
            img.src = url;

            img.onerror = () => {
                notification['error']({
                    message: '올바른 이미지 주소를 입력하십시오.'
                })
            };

            img.onload = () => {

                if (this.state.imageList.length === 0) {
                    this.setState({
                        showInputNotice: true
                    })
                }
                this.setState({
                    imageList: [...this.state.imageList, url],
                    inputUrl: ''
                })
            };
        }
    }

    postTopic = async () => {
        if (this.state.imageList.length === 0) { 
            notification['error']({
                message: "请选择图片"
            });
            return
        }

        let resposne = await API.addTopic({
            topicImg: this.state.imageList,
            topicTitle: this.state.topicDescript
        })
        notification['success']({
            message: resposne.message
        });

        this.props.togglePostTopic(true)
    }

    render () {
        let {userInfo} = this.props

        let avatarStyle = {
            width: '40px',
            height: '40px'
        }

        let InputUrl = () => {
            return (
                <section key={1} className="input-url">
                    {
                        this.state.showInputNotice ?
                            <div className="notice" onClick={this.changeInpurUrlStatus}>
                                <i className="icon"></i>
                                {
                                    this.state.imageList.length > 0 ?
                                        <span>添加另一张</span>
                                        :
                                        <span>添加照片</span>
                                }
                            </div>
                            :
                            <div className="input-container">
                                <span className="close-circle" onClick={this.closeInputUrl}></span>
                                <input 
                                    type = 'text' 
                                    defaultValue={this.state.inputUrl} 
                                    // onChange={this.handelChange} 
                                    // onChange={(event) => { this.handelChange(event.target.value) }}
                                    onKeyPress={this.pushImgUrl} 
                                    placeholder="输入图片地址后，按回车即可" />
                            </div>
                        }
                </section>
            )
        }

        let ImgUpload = () => {
            return (
                <section className="image-upload">
                    <div>
                        {/* <span><Upload/></span> */}
                        <span><DefaultUpload successCb={uploadImgSuccess} /></span>
                    </div>
                </section>
            )
        }

        let UploadPlaceholder = () => {
            return (
                <div>
                        <ImageUpload
                            uploadImgSuccess={this.uploadImgSuccess}
                            changeUploadStatus={this.changeUploadStatus}
                        />
                </div>
            )
        }

        return (
            <div className={`${Style['post-topic']}`} >
                <section className="topic-content">
                    <header>
                        <Avatar userInfo={userInfo} avatarStyle={avatarStyle}/>
                    </header>
                    
                    {
                        this.state.imageList.length > 0?
                        (
                            <section className="image-list">
                                <Carousel imageList={this.state.imageList} delectPhoto={this.delectPhoto} showCloseBtn={true} showSlickDot={false}></Carousel>
                            </section>
                        )
                        :
                        ""
                    }

                    <div className="upload-style">
                        <UploadPlaceholder />
                    </div>

                    <div className="descript">
                        <textarea  value={this.state.topicDescript} onChange={this.handelChangeTextArea} rows="4" cols="50" placeholder="게시글 내용 작성"></textarea>
                    </div>

                    <footer className="footer">
                        <span className="close" onClick={()=> this.props.togglePostTopic()}>취소</span>
                        <span className="post" onClick={this.postTopic}>등록</span>
                    </footer>
                </section>
            </div>
        )
    }
}

export default withRouter(PostTopic)