(ns simple-billy-api.specs.shareholder-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shareholder-create-data
  {
   (ds/opt :address) string?
   (ds/opt :birthDate) inst?
   (ds/opt :email) string?
   (ds/opt :firstName) string?
   (ds/opt :lastName) string?
   (ds/opt :shareNumber) string?
   (ds/opt :shares) string?
   })

(def shareholder-create-spec
  (ds/spec
    {:name ::shareholder-create
     :spec shareholder-create-data}))
