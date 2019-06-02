import React, { createRef } from "react";
import { connect } from "react-redux";
import $ from "jquery";

import Nav from '../../components/nav/index.js'
import Style from './index.scss'

window.jQuery = $;
window.$ = $;

require("jquery-ui-sortable");
require("formBuilder");

const formData = [
    {
      type: "header",
      subtype: "h1",
      label: "주문서 제목"
    }
  ];

@connect(
    store => {
        return {
            searchInfo: store.searchInfo,
            userInfo: store.userInfo
        }
    }
)
class SellForm extends React.Component {
    fb = createRef();
    componentDidMount() {
      $(this.fb.current).formBuilder({ formData });
    }

    render() {
        return (
        <main>
            <Nav />
            <div className="page-container">
                <section className={Style['sellerform']}>
                    <div id="fb-editor" ref={this.fb} />
                </section>
            </div>
        </main>
        )
    }
}
export default SellForm