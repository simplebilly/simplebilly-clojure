(ns simple-billy-api.specs.shareholder
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shareholder-data
  {
   (ds/opt :address) string?
   (ds/opt :birthDate) inst?
   (ds/opt :email) string?
   (ds/opt :firstName) string?
   (ds/opt :lastName) string?
   (ds/opt :shareNumber) string?
   (ds/opt :shares) string?
   })

(def shareholder-spec
  (ds/spec
    {:name ::shareholder
     :spec shareholder-data}))
