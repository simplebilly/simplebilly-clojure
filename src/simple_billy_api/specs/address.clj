(ns simple-billy-api.specs.address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def address-data
  {
   (ds/req :city) string?
   (ds/opt :company) string?
   (ds/req :country) string?
   (ds/opt :email) string?
   (ds/req :name) string?
   (ds/opt :phone) string?
   (ds/req :street) string?
   (ds/req :street_number) string?
   (ds/req :zip) string?
   })

(def address-spec
  (ds/spec
    {:name ::address
     :spec address-data}))
