# Tapsodia

Tapsodia is a small Spring Boot project.
## Features

### Publish
- **Create Post**: Create a new post with content.
- **Get Post**: Fetch a post by its ID.
- **Update Post**: Update the content of an existing post.
- **Delete Post**: Delete a post by its ID.

### Timeline

- **View Timeline**: Fetch posts in reverse chronological order (most recent first) with pagination.
- **Last ID-Based Fetching**: The timeline API supports fetching posts using a `lastId` parameter.
   - If `lastId` is provided, it fetches the next 10 posts with IDs less than the specified `lastId`.
   - If `lastId` is not provided, it fetches the 10 most recent posts.

### Caching 
- **Timeline Caching**: The timeline API leverages caching to improve performance. It uses Redis (or another caching provider) to store the results of the timeline API for faster retrieval.
  
## Technologies Used
- **Spring Boot**: Backend framework for building the application.
- **JPA/Hibernate**: For database interaction and object-relational mapping.
- **PostgreSQL**: The database used to store post data.

## Setup Instructions

### Prerequisites
- Java 17 or above
- PostgreSQL 

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/tapsodia.git
   cd tapsodia