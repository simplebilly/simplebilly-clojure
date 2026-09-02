(ns simple-billy-api.specs.purchase-order-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def purchase-order-status-update-data
  {
   (ds/req :status) string?
   })

(def purchase-order-status-update-spec
  (ds/spec
    {:name ::purchase-order-status-update
     :spec purchase-order-status-update-data}))
