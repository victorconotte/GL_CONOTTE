window.onload = function(){
	function getServerData(url, success){
    	$.ajax({
        	dataType: "json",
        	url: url
    	}).done(success);
	}

	function callDone(result){
		var templateExample = _.template($('#templateExample').html());

		var html = templateExample({
			"attribute":JSON.stringify(result)
		});

		$("#result").append(html);
	}

	
	register = () =>{
    console.log("function register() called");
    console.log(document.getElementById("champ-pass").value);
    postServerDataSatutu("ws/lef/register","email="+document.getElementById("champ-email").value+"&pass="+document.getElementById("champ-pass").value,function(result){
        alert(result);
    });
}