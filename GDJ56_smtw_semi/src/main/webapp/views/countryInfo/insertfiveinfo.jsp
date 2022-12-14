<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/views/common/header.jsp" %>
<section>
    <div id="insertCountrypage">
        <fieldset>
            <legend><h1 style="text-align: centers;">국가정보 입력하는 페이지</h1></legend>
                <br>
                <div>
                    국가/지역소개
                    <br><textarea name="" id="" cols="100" rows="30" placeholder="국가/지역소개 입력" ></textarea>
                </div>
                <br>    
                <div>
                    워홀비자 
                    <br><textarea name="" id="" cols="100" rows="30" placeholder="워홀비자 입력" ></textarea>
                </div>
                <br>  
                <div>
                    안전정보 
                    <br><textarea name="" id="" cols="100" rows="30" placeholder="안전정보 입력" ></textarea>
                </div>
                <br>  
                <div>
                    초기정착 
                    <br><textarea name="" id="" cols="100" rows="30" placeholder="초기정착 입력" ></textarea>
                </div>
                <br>  
                <div>
                    취업정보 
                    <br><textarea name="" id="" cols="100" rows="30" placeholder="취업정보 입력" ></textarea>
                </div>
                <br>  
			    <div id="twobu">
			        <button class="customBtn btnStyle"><span>등록</span></button>
			    </div>
        </fieldset>
    </div>
    <style>
    	#insertCountrypage{
 			padding-left:25%;
	    	padding-right:25%;
    	
    	}
    	#twobu{
    		padding-left:80%;
    	}
    	#twobu>button{
    		width:100px;
    	}
            section{
  /*           border: 1px solid tomato; */
            
            margin-left: 50px;
            margin-right: 50px;
            padding-left: 100px;
            padding-right: 100px;
            /* 
                만약 섹션 안에 div를 만든다면 여기 padding-left,padding-right에서
                좌우 간격을 조정하세요
                왼쪽 오른쪽도 웬만하면 다같이 맞추면 좋을 듯 하니 각자 만들어보고 의견주세요
             */
            margin-top: 100px;
            height:auto;
            /*
                ->내가 사용하는 중간 섹션부분의 크기를 조절하려면 이 height를 조정하세요★★
                높낮이 조절해도 footer침범하지 않도록 설정해놨으니 마음껏 늘려도 됩니다.
            */
            
        }
    
    
    
        .customBtn {
            color: #fff;
            border-radius: 5px;
            padding: 10px 25px;
            font-family: 'Lato', sans-serif;
            font-weight: 500;
            background: transparent;
            cursor: pointer;
            transition: all 0.3s ease;
            position: relative;
            display: inline-block;
            box-shadow:inset 2px 2px 2px 0px rgba(255,255,255,.5),
            7px 7px 20px 0px rgba(0,0,0,.1),
            4px 4px 5px 0px rgba(0,0,0,.1);
            outline: none;
            }
        .btnStyle {
            line-height: 42px;
            padding: 0;
            border: none;
            background: #7e8cd2;
            background: linear-gradient(0deg, #7e8cd2 0%, #7e8cd2 100%);
        }
        .btnStyle:hover {
            color: #7e8cd2;
            background: transparent;
            box-shadow:none;
        }
        .btnStyle:before,.btnStyle:after{
            content:'';
            position:absolute;
            top:0;
            right:0;
            height:2px;
            width:0;
            background: #7e8cd2;
            box-shadow:
            -1px -1px 5px 0px #fff,
            7px 7px 20px 0px #0003,
            4px 4px 5px 0px #0002;
            transition:400ms ease all;
        }
        .btnStyle:after{
            right:inherit;
            top:inherit;
            left:0;
            bottom:0;
        }
        .btnStyle:hover:before,.btnStyle:hover:after{
            width:100%;
            transition:800ms ease all;
        }
        
    </style>
</section>
<%@ include file="/views/common/footer.jsp" %>