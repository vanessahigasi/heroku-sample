
class App extends React.Component{

    componentDidMount() {

        console.log("Component Loaded");

        const helloPromise = axios.get("/api/hello");

        helloPromise.then(response => {
            const helloMessage =  response.data;
            console.log(helloMessage);
        });
    }

    render() {

        return (
            <div>
                <h1>Sample Heroku App</h1>
                <p>
                    This is a sample
                </p>
            </div>
        );
    }
}
