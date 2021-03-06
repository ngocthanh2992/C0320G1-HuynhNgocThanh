interface ISingleRepo {
    name : string;
}
interface IRepo {
    items: Array<ISingleRepo>;
}
// @ts-ignore
async function fetchRepo(): Promise<Array<ISingleRepo>> {
    // @ts-ignore
    let res: Response | IRepos = await fetch('https://api.github.com/search/repositories?q=CGDN');
    // @ts-ignore
    res = await res.json() as IRepos;
    return res.items;
}
function createItem(text: string): HTMLLIElement {
    const item = document.createElement('li') as HTMLLIElement;
    item.textContent = text;
    return item;
}

const container = document.querySelector('.app .list');

// @ts-ignore
async function main() {
    // step 1: fetch repo
    const res = await fetchRepo();
    // step 2: lặp qua mảng các item trả về
    // step 3: call hàm createItem sau đó truyền vào name của từng item ở mỗi vòng lặp
    // step 4: call hàm container.appendChild(item mà hàm createItem trả về)
    res.forEach((item: any) => {
        const li = createItem(item.html_url);
        container.appendChild(li);
    });
}

main();
