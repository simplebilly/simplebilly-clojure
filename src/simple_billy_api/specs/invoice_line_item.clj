(ns simple-billy-api.specs.invoice-line-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def invoice-line-item-data
  {
   (ds/opt :article_number) string?
   (ds/req :description) string?
   (ds/opt :discount_amount) string?
   (ds/opt :discount_percentage) string?
   (ds/opt :input_vat_deductible) boolean?
   (ds/opt :input_vat_rate) string?
   (ds/opt :is_intra_community_acquisition) boolean?
   (ds/opt :is_margin_25a) boolean?
   (ds/opt :ledger_account) string?
   (ds/req :line_total) string?
   (ds/opt :line_total_gross) string?
   (ds/opt :margin_25a_purchase_price) string?
   (ds/opt :meter_point_id) uuid?
   (ds/req :position) int?
   (ds/opt :price_components) any-type-spec
   (ds/opt :product_id) uuid?
   (ds/opt :product_sku) string?
   (ds/req :quantity) string?
   (ds/opt :supplier_article_number) string?
   (ds/opt :tax_rate) string?
   (ds/req :unit) any-type-spec
   (ds/req :unit_price) string?
   (ds/opt :usage_data_id) uuid?
   (ds/opt :vat_rate_nominal) string?
   (ds/opt :vat_special_case) string?
   })

(def invoice-line-item-spec
  (ds/spec
    {:name ::invoice-line-item
     :spec invoice-line-item-data}))
