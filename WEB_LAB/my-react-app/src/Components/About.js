import React, { Component } from "react";
class About extends Component {
    render() {
        return (
            <div>
                <h2 align="center">Batch 1</h2>
                <table border={3} align="center">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Roll No</th>
                        </tr>
                    </thead>
                    <tr>
                        <td>Mukund Gangurde</td>
                        <td>MCA2511</td>
                    </tr>
                    <tr>
                        <td>Omkar Halpatrao</td>
                        <td>MCA2512</td>
                    </tr>
                    <tr>
                        <td>Aman Dubey</td>
                        <td>MCA2509</td>
                    </tr>
                </table>
            </div>
        )
    }
}
export default About;