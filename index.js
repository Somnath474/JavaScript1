let url = "http://universities.hipolabs.com/search?name=";
let btn = document.querySelector("button");

btn.addEventListener("click", async () => {
    let country = document.querySelector("input").value.trim();
    console.log(country);
    let colArr = await getColleges(country);
    show(colArr);
});

async function getColleges(country) {
    try {
        let res = await axios.get(url + country);
        console.log(res.data);
        return res.data; // ✅ Now returning the data
    } catch (e) {
        console.log("error: ", e);
        return [];
    }
}

function show(colArr) {
    let list = document.querySelector("#list");
    list.innerHTML = ""; // ✅ Clear previous list items

    for (let col of colArr) {
        console.log(col.name);
        let li = document.createElement("li");
        li.innerText = col.name;
        list.appendChild(li);
    }
}
