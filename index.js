let btn=document.querySelector("button");
console.dir(btn);

btn.onclick=function(){
    console.log("Button was clicked");
};

function sayhello(){
   alert("Hello!"); 
}

btn.onclick=sayhello;