(ns simple-billy-api.specs.invoice-match-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invoice-match-request-data
  {
   (ds/req :supplier_invoice_id) string?
   })

(def invoice-match-request-spec
  (ds/spec
    {:name ::invoice-match-request
     :spec invoice-match-request-data}))
