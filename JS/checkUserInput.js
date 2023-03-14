
var psd=false;//判断密码是否可行
var ensurePsd=false;//判断确认密码是否可行
var checkEmail=false;//判断Email是否可行
var tempPsd="",tempEnsurePsd="";
var canRegiste=false;//判断整体的输入是否能注册
/*
onInputChange用来检测各个文本框输入是否符合要求
2023.03.14 15:52
 */
function onInputChange(o){
    var ensurePsdLabel=document.getElementById("ensurePsdLabel");
    var psdLab=document.getElementById("psdLabel");
    var emailLab=document.getElementById("registerEmailLabel");
    /*
    密码可行：有大小写字幕、数字和特殊字符
     */
      //判断此时是否是密码框在输入
      if(o.name==="registerUserPsd"){
          tempPsd=o.value;
         canSubmitPsd(o.value);

      function canSubmitPsd(s){

          var hasLowerCase=false;
          var hasUpperCase=false;
          var hasNum=false;
          var hasSpecialChar=false;
          for (let i = 0; i < s.length; i++) {
             if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                 hasLowerCase=true;
             } else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                 hasUpperCase=true;
             }else if(s.charAt(i)>='0'&&s.charAt(i)<='Z'){
                 hasNum=true;
             }else{
                 hasSpecialChar=true;
             }
          }
          if (hasLowerCase&&hasUpperCase&&hasNum&&hasSpecialChar){
              //更改密码label的文字和颜色
              psdLab.innerHTML="√  密码格式正确"

            psdLab.style.color="green";
              psd=true;
          }else{
              psdLab.innerHTML="  * （密码必须包括大小写字母、数字、特殊字符）"
              psdLab.style.color="red";
              psd=false;

          }

      }
      }

          if(o.name==="ensurePsd"){
                tempEnsurePsd=o.value;
          }
    if(tempPsd!==""&&tempEnsurePsd!==""&&tempEnsurePsd===tempPsd){
        ensurePsd=true;
        ensurePsdLabel.innerHTML="√  两次密码输入一致！"
        ensurePsdLabel.style.color="green"

    }else{
        ensurePsd=false;
        ensurePsdLabel.innerHTML="* （两次密码输入不一致！）"
        ensurePsdLabel.style.color="red"
    }
    if(o.name==="registerUserEmail"){
        var email="";
        email=o.value;
        if(email===""){
            checkEmail=false;
           emailLab.innerHTML="* 邮箱不能为空！"
            emailLab.style.color="red"
        }else if(!(email.includes('@')&&email.includes('.'))){
            checkEmail=false;
            emailLab.innerHTML="* 邮箱格式不正确！"
            emailLab.style.color="red"
        }else{
            checkEmail=true;
            emailLab.innerHTML="√  邮箱格式正确！"
            emailLab.style.color="green"
        }
    }
    if(psd&&ensurePsd&&checkEmail){
       //所有注册条件满足，可以注册
        canRegiste=true;
    }
}
/*
onClickSubmit 是返回给注册页面的表单的，用来判断能否进行下一步注册
若可以，则提交表单给Servlert
 */
function onClickSubmit(){
  if(canRegiste){

      return true;
  }else{
      return false;
  }

}