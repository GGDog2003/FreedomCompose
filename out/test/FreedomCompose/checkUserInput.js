var psd=false;
var ensurePsd=false;
var checkEmail=false;
var tempPsd="",tempEnsurePsd="";
var canRegiste=false;
/*
onInputChange用来检测输入密码的格式和两次输入密码是否相同
2023.03.14 15:52
 */
function onInputChange(o){
    var ensurePsdLabel=document.getElementById("ensurePsdLabel");
    var psdLab=document.getElementById("psdLabel");
    var emailLab=document.getElementById("registerEmailLabel");
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
function onClickSubmit(){
  if(canRegiste){
      return true;
  }else{
      return false;
  }

}