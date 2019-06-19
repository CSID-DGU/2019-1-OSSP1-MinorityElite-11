import React, { createRef } from "react";
import { connect } from "react-redux";
import $ from "jquery";

import Nav from '../../components/nav/index.js'
import Style from './index.scss'
import API from '@common/api.js'

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
      jQuery(function($) {      
        var fbEditor = document.getElementById('fb-editor');
        var formBuilder = $(fbEditor).formBuilder({formData});
        document.getElementById('getXML').addEventListener('click', function() {
            alert(formBuilder.actions.getData('xml'));
          });
          document.getElementById('getJSON').addEventListener('click', async function() {
            alert(formBuilder.actions.getData('json'));
            const formData = formBuilder.actions.getData('json');
            const response = await API.addForm({
                title : "form title",
                formData : formData
            });
            console.log(response);
          });
          document.getElementById('getJS').addEventListener('click', function() {
            alert('check console');
            console.log(formBuilder.actions.getData());
          });
          $('.save-template').css("display", "none");  
      });
    }

    render() {
        return (
        <main>
            <Nav />
            <div className="page-container">
                <section className={Style['sellerform']}>
                    <div id="fb-editor" ref={this.fb} />
                    <div className="setDataWrap">
                        <button className="save_btn" id="getJSON" type="button">Save</button>
                    </div>
                </section>
            </div>
        </main>
        )
    }
}
export default SellForm