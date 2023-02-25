package com.example.service.company

import com.example.models.common.PaginatedResult
import com.example.models.company.CompanyPayload

interface CompanyService {
    suspend fun getAllCompanies(page: Int, limit: Int): PaginatedResult<CompanyPayload>
    suspend fun createCompany(userId: Int, companyPayload: CompanyPayload): CompanyPayload?
    suspend fun updateCompany(companyId: Int, userId: Int, companyPayload: CompanyPayload): Boolean
    suspend fun deleteCompany(companyId: Int): Boolean
}