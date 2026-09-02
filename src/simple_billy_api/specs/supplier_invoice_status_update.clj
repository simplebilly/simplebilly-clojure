(ns simple-billy-api.specs.supplier-invoice-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def supplier-invoice-status-update-data
  {
   (ds/req :status) string?
   })

(def supplier-invoice-status-update-spec
  (ds/spec
    {:name ::supplier-invoice-status-update
     :spec supplier-invoice-status-update-data}))
