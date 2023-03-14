var canSubmit=false;
function onInputChange(o){
      if(o.name==="registerUserPsd"){
       var psdLab=document.getElementById("psdLabel").innerHTML;
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

             if (hasLowerCase&&hasUpperCase&&hasNum&&hasSpecialChar){
                 alert("密码格式正确！")
             }

          }
      }
      }
}
function onClickSubmit(){
  var newUserName=document.getElementsByName("registerUserName");



}