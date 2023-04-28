package com.example.service.inventorysystem.invoice

import com.example.models.common.PaginatedResult
import com.example.models.inventorysystem.invoices.InvoicePayload

interface InvoiceService {
    suspend fun getAllInvoices(page: Int, limit: Int): PaginatedResult<InvoicePayload>
    suspend fun createInvoice(invoicePayload: InvoicePayload): InvoicePayload?
    suspend fun updateInvoice(invoiceId: Int, invoicePayload: InvoicePayload): Boolean
    suspend fun deleteInvoice(invoiceId: Int): Boolean
}