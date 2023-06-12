// UserDetails.js
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { URL } from '../config'

const UserDetails = ({ id }) => {
  const [user, setUser] = useState(null);

  useEffect(() => {
    // Fetch user data from the backend
    const fetchUser = async () => {
      try {
        const response = await axios.get(`${URL}/users/${id}`);
        setUser(response.data);
      } catch (error) {
        console.error('Error fetching user:', error);
      }
    };

    fetchUser();
  }, [id]);

  if (!user) {
    return <div>Loading...</div>;
  }

  return (
    <div>
      <h2>User Details</h2>
      <p>Username: {user.id}</p>
      <p>Name: {user.name}</p>
      <p>address: {user.address}</p>
      <p>mobile no: {user.mobileNo}</p>

      <h3>Medicines</h3>
      <ul>
        {user.medicines.map((medicine) => (
          <li key={medicine.mid}>{medicine.medicineName} - {medicine.dosageInfo}</li>
        ))}
      </ul>
    </div>
  );
};

export default UserDetails;
