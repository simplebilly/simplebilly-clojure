(ns simple-billy-api.specs.shareholder-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shareholder-update-data
  {
   (ds/opt :address) string?
   (ds/opt :birthDate) inst?
   (ds/opt :email) string?
   (ds/opt :firstName) string?
   (ds/opt :lastName) string?
   (ds/opt :shareNumber) string?
   (ds/opt :shares) string?
   })

(def shareholder-update-spec
  (ds/spec
    {:name ::shareholder-update
     :spec shareholder-update-data}))
