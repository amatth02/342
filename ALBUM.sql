CREATE TABLE [dbo].[ALBUM](
	[albumID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[description] [nvarchar](max) NOT NULL,
	[location] [int] NULL,
	[link] [nvarchar](50) NOT NULL,
	[privacy] [char](10) NOT NULL,
	[count] [int] NOT NULL,
	[comments] [nvarchar](50) NOT NULL,
	[photos] [image] NOT NULL,
 CONSTRAINT [PK_ALBUM] PRIMARY KEY CLUSTERED 
(
	[albumID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
